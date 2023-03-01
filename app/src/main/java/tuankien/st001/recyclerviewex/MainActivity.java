package tuankien.st001.recyclerviewex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    private WordViewHolder mViewHolder;
    private LinkedList<NewsView> mNewsList = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNewsList.add(new NewsView(R.drawable.pkd001, "Bulbasaur #001", "Stater Gen 1 | Type: Grass/Poison", "There is a plant seed on its back right from the day this Pokémon is born. The seed slowly grows larger."));
        mNewsList.add(new NewsView(R.drawable.pkd002, "Ivysaur #002", "Stater Gen 1 | Type: Grass/Poison", "When the bulb on its back grows large, it appears to lose the ability to stand on its hind legs."));
        mNewsList.add(new NewsView(R.drawable.pkd003, "Venusaur #003", "Stater Gen 1 | Type: Grass/Poison", "Its plant blooms when it is absorbing solar energy. It stays on the move to seek sunlight."));
        mNewsList.add(new NewsView(R.drawable.pkd004, "Charmander #004", "Stater Gen 1 | Type: Fire/Fly", "It has a preference for hot things. When it rains, steam is said to spout from the tip of its tail."));
        mNewsList.add(new NewsView(R.drawable.pkd005, "Charmeleon #005", "Stater Gen 1 | Type: Fire/Fly", "It has a barbaric nature. In battle, it whips its fiery tail around and slashes away with sharp claws."));
        mNewsList.add(new NewsView(R.drawable.pkd006, "Charizard #006", "Stater Gen 1 | Type: Fire/Fly", "It spits fire that is hot enough to melt boulders. It may cause forest fires by blowing flames."));
        mNewsList.add(new NewsView(R.drawable.pkd007, "Squirtle #007", "Stater Gen 1 | Type: Water", "When it retracts its long neck into its shell, it squirts out water with vigorous force."));
        mNewsList.add(new NewsView(R.drawable.pkd008, "Wartortle #008", "Stater Gen 1 | Type: Water", "It is recognized as a symbol of longevity. If its shell has algae on it, that Wartortle is very old."));
        mNewsList.add(new NewsView(R.drawable.pkd009, "Blastoise #009", "Stater Gen 1 | Type: Water", "It crushes its foe under its heavy body to cause fainting. In a pinch, it will withdraw inside its shell."));

        mRecyclerView = findViewById(R.id.recycleview);
        mAdapter = new WordListAdapter(this, mNewsList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}