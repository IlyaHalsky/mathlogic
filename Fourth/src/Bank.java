
public class Bank {

    public static String[] forall_bank = new String[83];
    public static String[] exists_bank = new String[107];
    public void init(){
        forall_bank[0] = "(A77&B77->A77)->(A77&B77->(A77->B77->C77))->(A77&B77->(B77->C77))";
        forall_bank[1] = "A77&B77->A77";
        forall_bank[2] = "(A77&B77->(A77->B77->C77))->(A77&B77->(B77->C77))";
        forall_bank[3] = "(A77->B77->C77)";
        forall_bank[4] = "(A77->B77->C77)->(A77&B77->(A77->B77->C77))";
        forall_bank[5] = "(A77&B77->(A77->B77->C77))";
        forall_bank[6] = "(A77&B77->B77->C77)";
        forall_bank[7] = "(A77&B77->B77)->(A77&B77->B77->C77)->(A77&B77->C77)";
        forall_bank[8] = "A77&B77->B77";
        forall_bank[9] = "(A77&B77->B77->C77)->(A77&B77->C77)";
        forall_bank[10] = "(A77&B77->C77)";
        forall_bank[11] = "(A77&B77->@v77C77)";
        forall_bank[12] = "(((A77->(B77->(A77&B77)))->(B77->(A77->(B77->(A77&B77)))))->(A77->((A77->(B77->(A77&B77)))->(B77->(A77->(B77->(A77&B77)))))))";
        forall_bank[13] = "((A77->(B77->(A77&B77)))->(B77->(A77->(B77->(A77&B77)))))";
        forall_bank[14] = "(A77->((A77->(B77->(A77&B77)))->(B77->(A77->(B77->(A77&B77))))))";
        forall_bank[15] = "((A77->(B77->(A77&B77)))->(A77->(A77->(B77->(A77&B77)))))";
        forall_bank[16] = "(A77->(B77->(A77&B77)))";
        forall_bank[17] = "(A77->(A77->(B77->(A77&B77))))";
        forall_bank[18] = "((A77->(A77->(B77->(A77&B77))))->((A77->((A77->(B77->(A77&B77)))->(B77->(A77->(B77->(A77&B77))))))->(A77->(B77->(A77->(B77->(A77&B77)))))))";
        forall_bank[19] = "((A77->((A77->(B77->(A77&B77)))->(B77->(A77->(B77->(A77&B77))))))->(A77->(B77->(A77->(B77->(A77&B77))))))";
        forall_bank[20] = "(A77->(B77->(A77->(B77->(A77&B77)))))";
        forall_bank[21] = "((A77->(B77->A77))->(A77->(A77->(B77->A77))))";
        forall_bank[22] = "(A77->(B77->A77))";
        forall_bank[23] = "(A77->(A77->(B77->A77)))";
        forall_bank[24] = "(A77->((A77->A77)->A77))";
        forall_bank[25] = "(A77->(A77->A77))";
        forall_bank[26] = "((A77->(A77->A77))->((A77->((A77->A77)->A77))->(A77->A77)))";
        forall_bank[27] = "((A77->((A77->A77)->A77))->(A77->A77))";
        forall_bank[28] = "(A77->A77)";
        forall_bank[29] = "((A77->A77)->((A77->(A77->(B77->A77)))->(A77->(B77->A77))))";
        forall_bank[30] = "((A77->(A77->(B77->A77)))->(A77->(B77->A77)))";
        forall_bank[31] = "(A77->(B77->A77))";
        forall_bank[32] = "(((B77->A77)->((B77->(A77->(B77->(A77&B77))))->(B77->(B77->(A77&B77)))))->(A77->((B77->A77)->((B77->(A77->(B77->(A77&B77))))->(B77->(B77->(A77&B77)))))))";
        forall_bank[33] = "((B77->A77)->((B77->(A77->(B77->(A77&B77))))->(B77->(B77->(A77&B77)))))";
        forall_bank[34] = "(A77->((B77->A77)->((B77->(A77->(B77->(A77&B77))))->(B77->(B77->(A77&B77))))))";
        forall_bank[35] = "((A77->(B77->A77))->((A77->((B77->A77)->((B77->(A77->(B77->(A77&B77))))->(B77->(B77->(A77&B77))))))->(A77->((B77->(A77->(B77->(A77&B77))))->(B77->(B77->(A77&B77)))))))";
        forall_bank[36] = "((A77->((B77->A77)->((B77->(A77->(B77->(A77&B77))))->(B77->(B77->(A77&B77))))))->(A77->((B77->(A77->(B77->(A77&B77))))->(B77->(B77->(A77&B77))))))";
        forall_bank[37] = "(A77->((B77->(A77->(B77->(A77&B77))))->(B77->(B77->(A77&B77)))))";
        forall_bank[38] = "((A77->(B77->(A77->(B77->(A77&B77)))))->((A77->((B77->(A77->(B77->(A77&B77))))->(B77->(B77->(A77&B77)))))->(A77->(B77->(B77->(A77&B77))))))";
        forall_bank[39] = "((A77->((B77->(A77->(B77->(A77&B77))))->(B77->(B77->(A77&B77)))))->(A77->(B77->(B77->(A77&B77)))))";
        forall_bank[40] = "(A77->(B77->(B77->(A77&B77))))";
        forall_bank[41] = "((B77->((B77->B77)->B77))->(A77->(B77->((B77->B77)->B77))))";
        forall_bank[42] = "(B77->((B77->B77)->B77))";
        forall_bank[43] = "(A77->(B77->((B77->B77)->B77)))";
        forall_bank[44] = "((B77->(B77->B77))->(A77->(B77->(B77->B77))))";
        forall_bank[45] = "(B77->(B77->B77))";
        forall_bank[46] = "(A77->(B77->(B77->B77)))";
        forall_bank[47] = "(((B77->(B77->B77))->((B77->((B77->B77)->B77))->(B77->B77)))->(A77->((B77->(B77->B77))->((B77->((B77->B77)->B77))->(B77->B77)))))";
        forall_bank[48] = "((B77->(B77->B77))->((B77->((B77->B77)->B77))->(B77->B77)))";
        forall_bank[49] = "(A77->((B77->(B77->B77))->((B77->((B77->B77)->B77))->(B77->B77))))";
        forall_bank[50] = "((A77->(B77->(B77->B77)))->((A77->((B77->(B77->B77))->((B77->((B77->B77)->B77))->(B77->B77))))->(A77->((B77->((B77->B77)->B77))->(B77->B77)))))";
        forall_bank[51] = "((A77->((B77->(B77->B77))->((B77->((B77->B77)->B77))->(B77->B77))))->(A77->((B77->((B77->B77)->B77))->(B77->B77))))";
        forall_bank[52] = "(A77->((B77->((B77->B77)->B77))->(B77->B77)))";
        forall_bank[53] = "((A77->(B77->((B77->B77)->B77)))->((A77->((B77->((B77->B77)->B77))->(B77->B77)))->(A77->(B77->B77))))";
        forall_bank[54] = "((A77->((B77->((B77->B77)->B77))->(B77->B77)))->(A77->(B77->B77)))";
        forall_bank[55] = "(A77->(B77->B77))";
        forall_bank[56] = "(((B77->B77)->((B77->(B77->(A77&B77)))->(B77->(A77&B77))))->(A77->((B77->B77)->((B77->(B77->(A77&B77)))->(B77->(A77&B77))))))";
        forall_bank[57] = "((B77->B77)->((B77->(B77->(A77&B77)))->(B77->(A77&B77))))";
        forall_bank[58] = "(A77->((B77->B77)->((B77->(B77->(A77&B77)))->(B77->(A77&B77)))))";
        forall_bank[59] = "((A77->(B77->B77))->((A77->((B77->B77)->((B77->(B77->(A77&B77)))->(B77->(A77&B77)))))->(A77->((B77->(B77->(A77&B77)))->(B77->(A77&B77))))))";
        forall_bank[60] = "((A77->((B77->B77)->((B77->(B77->(A77&B77)))->(B77->(A77&B77)))))->(A77->((B77->(B77->(A77&B77)))->(B77->(A77&B77)))))";
        forall_bank[61] = "(A77->((B77->(B77->(A77&B77)))->(B77->(A77&B77))))";
        forall_bank[62] = "((A77->A77)->((A77->(A77->(B77->(A77&B77))))->(A77->(B77->(A77&B77)))))";
        forall_bank[63] = "((A77->(A77->(B77->(A77&B77))))->(A77->(B77->(A77&B77))))";
        forall_bank[64] = "(A77->(B77->(A77&B77)))";
        forall_bank[65] = "((((A77&B77)->@v77C77)->(B77->((A77&B77)->@v77C77)))->(A77->(((A77&B77)->@v77C77)->(B77->((A77&B77)->@v77C77)))))";
        forall_bank[66] = "(((A77&B77)->@v77C77)->(B77->((A77&B77)->@v77C77)))";
        forall_bank[67] = "(A77->(((A77&B77)->@v77C77)->(B77->((A77&B77)->@v77C77))))";
        forall_bank[68] = "(((A77&B77)->@v77C77)->(A77->((A77&B77)->@v77C77)))";
        forall_bank[69] = "((A77&B77)->@v77C77)";
        forall_bank[70] = "(A77->((A77&B77)->@v77C77))";
        forall_bank[71] = "((A77->((A77&B77)->@v77C77))->((A77->(((A77&B77)->@v77C77)->(B77->((A77&B77)->@v77C77))))->(A77->(B77->((A77&B77)->@v77C77)))))";
        forall_bank[72] = "((A77->(((A77&B77)->@v77C77)->(B77->((A77&B77)->@v77C77))))->(A77->(B77->((A77&B77)->@v77C77))))";
        forall_bank[73] = "(A77->(B77->((A77&B77)->@v77C77)))";
        forall_bank[74] = "(((B77->(A77&B77))->((B77->((A77&B77)->@v77C77))->(B77->@v77C77)))->(A77->((B77->(A77&B77))->((B77->((A77&B77)->@v77C77))->(B77->@v77C77)))))";
        forall_bank[75] = "((B77->(A77&B77))->((B77->((A77&B77)->@v77C77))->(B77->@v77C77)))";
        forall_bank[76] = "(A77->((B77->(A77&B77))->((B77->((A77&B77)->@v77C77))->(B77->@v77C77))))";
        forall_bank[77] = "((A77->(B77->(A77&B77)))->((A77->((B77->(A77&B77))->((B77->((A77&B77)->@v77C77))->(B77->@v77C77))))->(A77->((B77->((A77&B77)->@v77C77))->(B77->@v77C77)))))";
        forall_bank[78] = "((A77->((B77->(A77&B77))->((B77->((A77&B77)->@v77C77))->(B77->@v77C77))))->(A77->((B77->((A77&B77)->@v77C77))->(B77->@v77C77))))";
        forall_bank[79] = "(A77->((B77->((A77&B77)->@v77C77))->(B77->@v77C77)))";
        forall_bank[80] = "((A77->(B77->((A77&B77)->@v77C77)))->((A77->((B77->((A77&B77)->@v77C77))->(B77->@v77C77)))->(A77->(B77->@v77C77))))";
        forall_bank[81] = "((A77->((B77->((A77&B77)->@v77C77))->(B77->@v77C77)))->(A77->(B77->@v77C77)))";
        forall_bank[82] = "(A77->(B77->@v77C77))";

        exists_bank[0] = "((A77->((A77->A77)->A77))->(B77->(A77->((A77->A77)->A77))))";
        exists_bank[1] = "(A77->((A77->A77)->A77))";
        exists_bank[2] = "(B77->(A77->((A77->A77)->A77)))";
        exists_bank[3] = "((A77->(A77->A77))->(B77->(A77->(A77->A77))))";
        exists_bank[4] = "(A77->(A77->A77))";
        exists_bank[5] = "(B77->(A77->(A77->A77)))";
        exists_bank[6] = "(((A77->(A77->A77))->((A77->((A77->A77)->A77))->(A77->A77)))->(B77->((A77->(A77->A77))->((A77->((A77->A77)->A77))->(A77->A77)))))";
        exists_bank[7] = "((A77->(A77->A77))->((A77->((A77->A77)->A77))->(A77->A77)))";
        exists_bank[8] = "(B77->((A77->(A77->A77))->((A77->((A77->A77)->A77))->(A77->A77))))";
        exists_bank[9] = "((B77->(A77->(A77->A77)))->((B77->((A77->(A77->A77))->((A77->((A77->A77)->A77))->(A77->A77))))->(B77->((A77->((A77->A77)->A77))->(A77->A77)))))";
        exists_bank[10] = "((B77->((A77->(A77->A77))->((A77->((A77->A77)->A77))->(A77->A77))))->(B77->((A77->((A77->A77)->A77))->(A77->A77))))";
        exists_bank[11] = "(B77->((A77->((A77->A77)->A77))->(A77->A77)))";
        exists_bank[12] = "((B77->(A77->((A77->A77)->A77)))->((B77->((A77->((A77->A77)->A77))->(A77->A77)))->(B77->(A77->A77))))";
        exists_bank[13] = "((B77->((A77->((A77->A77)->A77))->(A77->A77)))->(B77->(A77->A77)))";
        exists_bank[14] = "(B77->(A77->A77))";
        exists_bank[15] = "(((A77->(B77->C77))->(A77->(A77->(B77->C77))))->(B77->((A77->(B77->C77))->(A77->(A77->(B77->C77))))))";
        exists_bank[16] = "((A77->(B77->C77))->(A77->(A77->(B77->C77))))";
        exists_bank[17] = "(B77->((A77->(B77->C77))->(A77->(A77->(B77->C77)))))";
        exists_bank[18] = "((A77->(B77->C77))->(B77->(A77->(B77->C77))))";
        exists_bank[19] = "(A77->(B77->C77))";
        exists_bank[20] = "(B77->(A77->(B77->C77)))";
        exists_bank[21] = "((B77->(A77->(B77->C77)))->((B77->((A77->(B77->C77))->(A77->(A77->(B77->C77)))))->(B77->(A77->(A77->(B77->C77))))))";
        exists_bank[22] = "((B77->((A77->(B77->C77))->(A77->(A77->(B77->C77)))))->(B77->(A77->(A77->(B77->C77)))))";
        exists_bank[23] = "(B77->(A77->(A77->(B77->C77))))";
        exists_bank[24] = "(((A77->A77)->((A77->(A77->(B77->C77)))->(A77->(B77->C77))))->(B77->((A77->A77)->((A77->(A77->(B77->C77)))->(A77->(B77->C77))))))";
        exists_bank[25] = "((A77->A77)->((A77->(A77->(B77->C77)))->(A77->(B77->C77))))";
        exists_bank[26] = "(B77->((A77->A77)->((A77->(A77->(B77->C77)))->(A77->(B77->C77)))))";
        exists_bank[27] = "((B77->(A77->A77))->((B77->((A77->A77)->((A77->(A77->(B77->C77)))->(A77->(B77->C77)))))->(B77->((A77->(A77->(B77->C77)))->(A77->(B77->C77))))))";
        exists_bank[28] = "((B77->((A77->A77)->((A77->(A77->(B77->C77)))->(A77->(B77->C77)))))->(B77->((A77->(A77->(B77->C77)))->(A77->(B77->C77)))))";
        exists_bank[29] = "(B77->((A77->(A77->(B77->C77)))->(A77->(B77->C77))))";
        exists_bank[30] = "((A77->(B77->C77))->(B77->(A77->(B77->C77))))";
        exists_bank[31] = "(A77->(B77->C77))";
        exists_bank[32] = "(B77->(A77->(B77->C77)))";
        exists_bank[33] = "((B77->(A77->B77))->(B77->(B77->(A77->B77))))";
        exists_bank[34] = "(B77->(A77->B77))";
        exists_bank[35] = "(B77->(B77->(A77->B77)))";
        exists_bank[36] = "(B77->((B77->B77)->B77))";
        exists_bank[37] = "(B77->(B77->B77))";
        exists_bank[38] = "((B77->(B77->B77))->((B77->((B77->B77)->B77))->(B77->B77)))";
        exists_bank[39] = "((B77->((B77->B77)->B77))->(B77->B77))";
        exists_bank[40] = "(B77->B77)";
        exists_bank[41] = "((B77->B77)->((B77->(B77->(A77->B77)))->(B77->(A77->B77))))";
        exists_bank[42] = "((B77->(B77->(A77->B77)))->(B77->(A77->B77)))";
        exists_bank[43] = "(B77->(A77->B77))";
        exists_bank[44] = "(((A77->B77)->((A77->(B77->C77))->(A77->C77)))->(B77->((A77->B77)->((A77->(B77->C77))->(A77->C77)))))";
        exists_bank[45] = "((A77->B77)->((A77->(B77->C77))->(A77->C77)))";
        exists_bank[46] = "(B77->((A77->B77)->((A77->(B77->C77))->(A77->C77))))";
        exists_bank[47] = "((B77->(A77->B77))->((B77->((A77->B77)->((A77->(B77->C77))->(A77->C77))))->(B77->((A77->(B77->C77))->(A77->C77)))))";
        exists_bank[48] = "((B77->((A77->B77)->((A77->(B77->C77))->(A77->C77))))->(B77->((A77->(B77->C77))->(A77->C77))))";
        exists_bank[49] = "(B77->((A77->(B77->C77))->(A77->C77)))";
        exists_bank[50] = "((B77->(A77->(B77->C77)))->((B77->((A77->(B77->C77))->(A77->C77)))->(B77->(A77->C77))))";
        exists_bank[51] = "((B77->((A77->(B77->C77))->(A77->C77)))->(B77->(A77->C77)))";
        exists_bank[52] = "(B77->(A77->C77))";
        exists_bank[53] = "(?v77B77->(A77->C77))";
        exists_bank[54] = "(((?v77B77->(A77->C77))->(?v77B77->(?v77B77->(A77->C77))))->(A77->((?v77B77->(A77->C77))->(?v77B77->(?v77B77->(A77->C77))))))";
        exists_bank[55] = "((?v77B77->(A77->C77))->(?v77B77->(?v77B77->(A77->C77))))";
        exists_bank[56] = "(A77->((?v77B77->(A77->C77))->(?v77B77->(?v77B77->(A77->C77)))))";
        exists_bank[57] = "((?v77B77->(A77->C77))->(A77->(?v77B77->(A77->C77))))";
        exists_bank[58] = "(?v77B77->(A77->C77))";
        exists_bank[59] = "(A77->(?v77B77->(A77->C77)))";
        exists_bank[60] = "((A77->(?v77B77->(A77->C77)))->((A77->((?v77B77->(A77->C77))->(?v77B77->(?v77B77->(A77->C77)))))->(A77->(?v77B77->(?v77B77->(A77->C77))))))";
        exists_bank[61] = "((A77->((?v77B77->(A77->C77))->(?v77B77->(?v77B77->(A77->C77)))))->(A77->(?v77B77->(?v77B77->(A77->C77)))))";
        exists_bank[62] = "(A77->(?v77B77->(?v77B77->(A77->C77))))";
        exists_bank[63] = "((?v77B77->((?v77B77->?v77B77)->?v77B77))->(A77->(?v77B77->((?v77B77->?v77B77)->?v77B77))))";
        exists_bank[64] = "(?v77B77->((?v77B77->?v77B77)->?v77B77))";
        exists_bank[65] = "(A77->(?v77B77->((?v77B77->?v77B77)->?v77B77)))";
        exists_bank[66] = "((?v77B77->(?v77B77->?v77B77))->(A77->(?v77B77->(?v77B77->?v77B77))))";
        exists_bank[67] = "(?v77B77->(?v77B77->?v77B77))";
        exists_bank[68] = "(A77->(?v77B77->(?v77B77->?v77B77)))";
        exists_bank[69] = "(((?v77B77->(?v77B77->?v77B77))->((?v77B77->((?v77B77->?v77B77)->?v77B77))->(?v77B77->?v77B77)))->(A77->((?v77B77->(?v77B77->?v77B77))->((?v77B77->((?v77B77->?v77B77)->?v77B77))->(?v77B77->?v77B77)))))";
        exists_bank[70] = "((?v77B77->(?v77B77->?v77B77))->((?v77B77->((?v77B77->?v77B77)->?v77B77))->(?v77B77->?v77B77)))";
        exists_bank[71] = "(A77->((?v77B77->(?v77B77->?v77B77))->((?v77B77->((?v77B77->?v77B77)->?v77B77))->(?v77B77->?v77B77))))";
        exists_bank[72] = "((A77->(?v77B77->(?v77B77->?v77B77)))->((A77->((?v77B77->(?v77B77->?v77B77))->((?v77B77->((?v77B77->?v77B77)->?v77B77))->(?v77B77->?v77B77))))->(A77->((?v77B77->((?v77B77->?v77B77)->?v77B77))->(?v77B77->?v77B77)))))";
        exists_bank[73] = "((A77->((?v77B77->(?v77B77->?v77B77))->((?v77B77->((?v77B77->?v77B77)->?v77B77))->(?v77B77->?v77B77))))->(A77->((?v77B77->((?v77B77->?v77B77)->?v77B77))->(?v77B77->?v77B77))))";
        exists_bank[74] = "(A77->((?v77B77->((?v77B77->?v77B77)->?v77B77))->(?v77B77->?v77B77)))";
        exists_bank[75] = "((A77->(?v77B77->((?v77B77->?v77B77)->?v77B77)))->((A77->((?v77B77->((?v77B77->?v77B77)->?v77B77))->(?v77B77->?v77B77)))->(A77->(?v77B77->?v77B77))))";
        exists_bank[76] = "((A77->((?v77B77->((?v77B77->?v77B77)->?v77B77))->(?v77B77->?v77B77)))->(A77->(?v77B77->?v77B77)))";
        exists_bank[77] = "(A77->(?v77B77->?v77B77))";
        exists_bank[78] = "(((?v77B77->?v77B77)->((?v77B77->(?v77B77->(A77->C77)))->(?v77B77->(A77->C77))))->(A77->((?v77B77->?v77B77)->((?v77B77->(?v77B77->(A77->C77)))->(?v77B77->(A77->C77))))))";
        exists_bank[79] = "((?v77B77->?v77B77)->((?v77B77->(?v77B77->(A77->C77)))->(?v77B77->(A77->C77))))";
        exists_bank[80] = "(A77->((?v77B77->?v77B77)->((?v77B77->(?v77B77->(A77->C77)))->(?v77B77->(A77->C77)))))";
        exists_bank[81] = "((A77->(?v77B77->?v77B77))->((A77->((?v77B77->?v77B77)->((?v77B77->(?v77B77->(A77->C77)))->(?v77B77->(A77->C77)))))->(A77->((?v77B77->(?v77B77->(A77->C77)))->(?v77B77->(A77->C77))))))";
        exists_bank[82] = "((A77->((?v77B77->?v77B77)->((?v77B77->(?v77B77->(A77->C77)))->(?v77B77->(A77->C77)))))->(A77->((?v77B77->(?v77B77->(A77->C77)))->(?v77B77->(A77->C77)))))";
        exists_bank[83] = "(A77->((?v77B77->(?v77B77->(A77->C77)))->(?v77B77->(A77->C77))))";
        exists_bank[84] = "((?v77B77->(A77->C77))->(A77->(?v77B77->(A77->C77))))";
        exists_bank[85] = "(?v77B77->(A77->C77))";
        exists_bank[86] = "(A77->(?v77B77->(A77->C77)))";
        exists_bank[87] = "((A77->(?v77B77->A77))->(A77->(A77->(?v77B77->A77))))";
        exists_bank[88] = "(A77->(?v77B77->A77))";
        exists_bank[89] = "(A77->(A77->(?v77B77->A77)))";
        exists_bank[90] = "(A77->((A77->A77)->A77))";
        exists_bank[91] = "(A77->(A77->A77))";
        exists_bank[92] = "((A77->(A77->A77))->((A77->((A77->A77)->A77))->(A77->A77)))";
        exists_bank[93] = "((A77->((A77->A77)->A77))->(A77->A77))";
        exists_bank[94] = "(A77->A77)";
        exists_bank[95] = "((A77->A77)->((A77->(A77->(?v77B77->A77)))->(A77->(?v77B77->A77))))";
        exists_bank[96] = "((A77->(A77->(?v77B77->A77)))->(A77->(?v77B77->A77)))";
        exists_bank[97] = "(A77->(?v77B77->A77))";
        exists_bank[98] = "(((?v77B77->A77)->((?v77B77->(A77->C77))->(?v77B77->C77)))->(A77->((?v77B77->A77)->((?v77B77->(A77->C77))->(?v77B77->C77)))))";
        exists_bank[99] = "((?v77B77->A77)->((?v77B77->(A77->C77))->(?v77B77->C77)))";
        exists_bank[100] = "(A77->((?v77B77->A77)->((?v77B77->(A77->C77))->(?v77B77->C77))))";
        exists_bank[101] = "((A77->(?v77B77->A77))->((A77->((?v77B77->A77)->((?v77B77->(A77->C77))->(?v77B77->C77))))->(A77->((?v77B77->(A77->C77))->(?v77B77->C77)))))";
        exists_bank[102] = "((A77->((?v77B77->A77)->((?v77B77->(A77->C77))->(?v77B77->C77))))->(A77->((?v77B77->(A77->C77))->(?v77B77->C77))))";
        exists_bank[103] = "(A77->((?v77B77->(A77->C77))->(?v77B77->C77)))";
        exists_bank[104] = "((A77->(?v77B77->(A77->C77)))->((A77->((?v77B77->(A77->C77))->(?v77B77->C77)))->(A77->(?v77B77->C77))))";
        exists_bank[105] = "((A77->((?v77B77->(A77->C77))->(?v77B77->C77)))->(A77->(?v77B77->C77)))";
        exists_bank[106] = "(A77->(?v77B77->C77))";
    }

    public static final String IMPLICATION = "Operations.Impl";
    public static final String CONJUCNTION = "Conj";
    public static final String DISJUCNTION = "Disj";
    public static final String EQUALITY = "Equal";
    public static final String NEGATION = "Neg";
    public static final String FORALL = "Forall";
    public static final String EXIST = "Exist";
    public static final String INCREMENT = "Incr";
    public static final String BRACKETS = "Brackets";
    public static final String PREDICATE = "Predicate";
    public static final String TERMWITHARGS = "TermWithArgs";
    public static final String VARIABLE = "Var";
    public static final String PLUS = "Plus";
    public static final String MULTIPLY= "Mul";
    public static final String INCORRECT_INPUT = "Вывод некорректен начиная с формулы номер ";

}
