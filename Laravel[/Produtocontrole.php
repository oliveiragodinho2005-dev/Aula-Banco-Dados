public function up(): void {
    Schema::create('produtos', function (Blueprint $table) {
        $table->id();
        $table->string('nome');
        $table->timestamps();
    });
}
use App\Models\Produto; // Importe o Model
use Illuminate\Http\Request; // Importe o Request

class ProdutoController extends Controller
{
    public function index()
    {
        $produtos = Produto::all(); // 1. Busca todos os produtos [cite: 14]
        return view('produtos', ['produtos' => $produtos]); // 2. Envia para a view
    }

    public function store(Request $request)
    {
        // Validação básica [cite: 43]
        $request->validate(['nome' => 'required']);

        // Salva no banco
        Produto::create($request->all());

        // Redireciona de volta
        return redirect()->route('produtos.index')->with('sucesso', 'Produto salvo!');
    }
}