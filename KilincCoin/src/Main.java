import java.util.ArrayList;

public class Main {
    ArrayList<Block> blockchain = new ArrayList<>();
    public static void main(String[] args) {

        String[] genesisTransaction = {"ismail sendte 100 bitcoin"};
        String[] genesisTransaction2 = {"ismail sendte 100000 bitcoin til Irfan"};

        Block genesisBlock = new Block(0,genesisTransaction);

        /*
        if i change anything in the string the signature
        will change too
         */
        System.out.println(genesisBlock.getBlockHash());


        Block block2 = new Block(genesisBlock.getBlockHash(),genesisTransaction2);
        System.out.println(block2.getBlockHash());
    }

}
