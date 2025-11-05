public function up(): void {
    Schema::create('categorias', function (Blueprint $table) {
        $table->id();
        $table->string('nome');
        $table->timestamps();
    });
}
use App\Models\Categoria; // Importe o Model
use Illuminate\Http\Request; // Importe o Request

class CategoriaController extends Controller
{
    public function index()
    {
        $categorias = Categoria::all(); // 1. Busca todas as categorias [cite: 14]
        return view('categorias', ['categorias' => $categorias]); // 2. Envia para a view
    }

    public function store(Request $request)
    {
        $request->validate(['nome' => 'required']); // [cite: 43]
        Categoria::create($request->all());
        return redirect()->route('categorias.index')->with('sucesso', 'Categoria salva!');
    }
}