package com.cet6.words;

import com.alibaba.fastjson.JSON;
import com.cet6.AttributeOfWords;
import com.cet6.MeaningOfWords;
import com.cet6.Word;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordList6 implements WordList {

    private List<Word> words;

    public WordList6() {
        words = new ArrayList<>();


        newWord("poetry", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "诗，诗歌，诗集")));

        newWord("highlight", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "最精彩的部分，最重要的事件 "),
                new MeaningOfWords(AttributeOfWords.VT, "强调，突出，使显著")));

        newWord("slash", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "砍，砍痕，斜线 "),
                new MeaningOfWords(AttributeOfWords.VT, "砍，大幅度削减")));

        newWord("ambition", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "雄心，抱负；野心；期望得到的东西")));

        newWord("reassure", newMeaning(
                new MeaningOfWords(AttributeOfWords.VT, "使放心")));

        newWord("abundance", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "大量，丰富，充足")));

        newWord("prosperous", newMeaning(
                new MeaningOfWords(AttributeOfWords.ADJ, "繁荣的，兴旺的")));

        newWord("submit", newMeaning(
                new MeaningOfWords(AttributeOfWords.V, "屈从，听从，服从；呈送，提交；主张，建议")));

        newWord("differentiate", newMeaning(
                new MeaningOfWords(AttributeOfWords.VT, "区分，区别；使不同，是有差异"),
                new MeaningOfWords(AttributeOfWords.VI, "区分")));

        newWord("court", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "法庭，法院；庭院；宫廷；球场")));

        newWord("security", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "安全，保障；抵押品；"),
                new MeaningOfWords(AttributeOfWords.PL, "证券")));

        newWord("quiver", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "颤抖，抖动，颤声"),
                new MeaningOfWords(AttributeOfWords.VI, "发抖")));

        newWord("bowel", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "肠"),
                new MeaningOfWords(AttributeOfWords.PL, "内部，深处")));

        newWord("subordinate", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "部署，下级"),
                new MeaningOfWords(AttributeOfWords.ADJ, "下级的，级别低的；次要的，从属"),
                new MeaningOfWords(AttributeOfWords.VT, "使处于次要地位，使从属于")));

        newWord("junk", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "废旧物品，破烂"),
                new MeaningOfWords(AttributeOfWords.VT, "废弃，丢弃")));

        newWord("consecutive", newMeaning(
                new MeaningOfWords(AttributeOfWords.ADJ, "连续的，连贯的")));

        newWord("subscribe", newMeaning(
                new MeaningOfWords(AttributeOfWords.VT, "捐助，赞助"),
                new MeaningOfWords(AttributeOfWords.VI, "订阅，订购（书籍等）；同意，赞成")));

        newWord("extinct", newMeaning(
                new MeaningOfWords(AttributeOfWords.ADJ, "灭绝的，绝种的；（火山等）不在活跃的，（火等）熄灭了的，（风俗等）已废弃的")));

        newWord("cork", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "软木；软木塞"),
                new MeaningOfWords(AttributeOfWords.VT, "用瓶塞塞住")));

        newWord("glare", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "强光；怒视，瞪眼；炫耀，张扬"),
                new MeaningOfWords(AttributeOfWords.VI, "怒目而视；发射强光，发出刺眼的光线")));

        newWord("dictate", newMeaning(
                new MeaningOfWords(AttributeOfWords.V, "口授，命令；规定，要求"),
                new MeaningOfWords(AttributeOfWords.N, "口授，命令；规定，要求")));

        newWord("credit", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "信贷，赊欠；赞扬，荣誉；学分；信任"),
                new MeaningOfWords(AttributeOfWords.VT, "相信；把...记入贷方；把...归功于")));

        newWord("dilemma", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "（进退两难的）窘境，困境")));

        newWord("prominent", newMeaning(
                new MeaningOfWords(AttributeOfWords.ADJ, "突出的，杰出的；突起的，凸出的")));
        newWord("insane", newMeaning(
                new MeaningOfWords(AttributeOfWords.ADJ, "极蠢的，荒唐的；（患）精神病的，精神失常的，疯狂的")));

        newWord("magnitude", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "重要，重大；巨大，广大")));

        newWord("hostage", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "人质")));

        newWord("exchange", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "交换，交流；兑换"),
                new MeaningOfWords(AttributeOfWords.VT, "交换，交流；兑换")));

        newWord("flank", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "肋，肋腹，（四足动物身体的）侧边；侧翼，翼侧"),
                new MeaningOfWords(AttributeOfWords.VT, "位于...的侧面")));

        newWord("convene", newMeaning(
                new MeaningOfWords(AttributeOfWords.VT, "召集"),
                new MeaningOfWords(AttributeOfWords.VI, "开会，集合")));

        newWord("affiliate", newMeaning(
                new MeaningOfWords(AttributeOfWords.VT, "使隶属（或附属）于"),
                new MeaningOfWords(AttributeOfWords.N, "附属机构，分公司")));

        newWord("inertia", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "不活动，惰性；惯性")));

        newWord("appearance", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "出现，来到；外观")));

        newWord("subsequent", newMeaning(
                new MeaningOfWords(AttributeOfWords.ADJ, "随后的；后来的")));

        newWord("reflect", newMeaning(
                new MeaningOfWords(AttributeOfWords.V, "反映，显示；反射，映现；深思，考虑，反省")));

        newWord("slump", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "萧条期，低潮"),
                new MeaningOfWords(AttributeOfWords.VI, "大幅度下降，暴跌；突然倒下")));

        newWord("skull", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "颅骨，脑壳")));

        newWord("implication", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "含义；暗示，暗指；卷入，牵连")));

        newWord("diligent", newMeaning(
                new MeaningOfWords(AttributeOfWords.ADJ, "勤勉的，勤奋的")));

        newWord("cradle", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "摇篮；发源地"),
                new MeaningOfWords(AttributeOfWords.VT, "轻轻的抱，抚育")));

        newWord("adapt", newMeaning(
                new MeaningOfWords(AttributeOfWords.VT, "使适应，改编")));

        newWord("skip", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "跳，蹦跳"),
                new MeaningOfWords(AttributeOfWords.VT, "跳过，略过，漏过"),
                new MeaningOfWords(AttributeOfWords.VI, "跳，跳绳")));

        newWord("erroneous", newMeaning(
                new MeaningOfWords(AttributeOfWords.ADJ, "错误的，不正确的")));

        newWord("subsidiary", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "子公司，附属机构"),
                new MeaningOfWords(AttributeOfWords.ADJ, "辅助的，次要的，附设的")));

        newWord("benefit", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "利益，恩惠；救济金；保障金，津贴"),
                new MeaningOfWords(AttributeOfWords.VT, "有益于"),
                new MeaningOfWords(AttributeOfWords.VI, "得益")));

        newWord("subsidy", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "津贴，补助金")));

        newWord("fabric", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "织物，纺织品；结构")));

        newWord("substance", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "物质；实质；大意，要旨；根据，理由")));

        newWord("adjust", newMeaning(
                new MeaningOfWords(AttributeOfWords.VT, "调整，调节，校正"),
                new MeaningOfWords(AttributeOfWords.VI, "适应")));

        newWord("elegant", newMeaning(
                new MeaningOfWords(AttributeOfWords.ADJ, "优美的，文雅的，讲究的；简练的，简洁的")));

        newWord("edible", newMeaning(
                new MeaningOfWords(AttributeOfWords.ADJ, "可以吃的，可食用的")));

        newWord("collaboration", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "合作，协作；勾结")));

        newWord("abuse", newMeaning(
                new MeaningOfWords(AttributeOfWords.VT, "滥用；虐待；辱骂"),
                new MeaningOfWords(AttributeOfWords.N, "滥用；虐待；辱骂")));

        newWord("imply", newMeaning(
                new MeaningOfWords(AttributeOfWords.VT, "暗示，意指")));

        newWord("distinct", newMeaning(
                new MeaningOfWords(AttributeOfWords.ADJ, "与其他不同的；清楚的，明确的")));

        newWord("economy", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "经济，节省，节约")));

        newWord("dock", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "码头，船（阜），（法庭的）被告席"),
                new MeaningOfWords(AttributeOfWords.VT, "使（船）靠码头，使（船）进港，从（工资）中扣除"),
                new MeaningOfWords(AttributeOfWords.VI, "（船）靠码头，（船）进港")));

        newWord("rim", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "（圆形物体的）边，缘"),
                new MeaningOfWords(AttributeOfWords.VT, "环绕（圆形或环形物）边缘")));

        newWord("indifferent", newMeaning(
                new MeaningOfWords(AttributeOfWords.ADJ, "冷漠的，不积极的；一般的，（表现）平平的")));

        newWord("appraisal", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "估计，估量；评价")));

        newWord("confidential", newMeaning(
                new MeaningOfWords(AttributeOfWords.ADJ, "秘密的，机密的；表示信任（或亲密）的；担任机密工作的")));

        newWord("administration", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "管理；管理部门，行政机关；实行，执行")));

        newWord("collapse", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "塌陷，瓦解；崩，突然失败"),
                new MeaningOfWords(AttributeOfWords.VI, "塌陷，瓦解；崩，突然失败")));

        newWord("instantaneous", newMeaning(
                new MeaningOfWords(AttributeOfWords.ADJ, "瞬间的，即刻的")));

        newWord("commodity", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "商品，货物")));

        newWord("affection", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "感情，情感；爱，爱慕")));

        newWord("environment", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "环境，外界，围绕")));

        newWord("complicated", newMeaning(
                new MeaningOfWords(AttributeOfWords.ADJ, "复杂的，难懂的")));

        newWord("comic", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "连环漫画（册）；喜剧演员"),
                new MeaningOfWords(AttributeOfWords.ADJ, "喜剧的，滑稽的")));

        newWord("evaluate", newMeaning(
                new MeaningOfWords(AttributeOfWords.VT, "评价，估...的价")));

        newWord("subtract", newMeaning(
                new MeaningOfWords(AttributeOfWords.VT, "减，减去；去掉")));

        newWord("suburb", newMeaning(
                new MeaningOfWords(AttributeOfWords.N, "郊区，郊外，近郊")));

        newWord("devote", newMeaning(
                new MeaningOfWords(AttributeOfWords.VT, "将...奉献给；把...专用（于）")
        ));
    }

    private void newWord(String english, List<MeaningOfWords> meaning) {
        words.add(new Word(english, meaning));
    }

    private static List<MeaningOfWords> newMeaning(MeaningOfWords... meaningOfWords) {
        return Arrays.asList(meaningOfWords);
    }


    public List<Word> getWords() {
        return words;
    }

    @Override
    public String toString() {
        return "WordList6{" +
                "words=" + words +
                '}';
    }

    @Override
    public boolean toJson() throws IOException {
        String wordList = JSON.toJSONString(words, true);
        BufferedOutputStream outputStream = new BufferedOutputStream(
                new FileOutputStream(new File("./word_list6.json")));

        outputStream.write(wordList.getBytes());
        outputStream.flush();
        outputStream.close();
        return true;
    }

    @Override
    public boolean loadJson() {
        return false;
    }
}
