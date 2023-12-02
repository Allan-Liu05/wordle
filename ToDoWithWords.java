
/**
 * Write a description of class WordSelect here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ToDoWithWords
{
    String masterWordList = "ABACK ABASE ABATE ABBEY ABOVE ABYSS ACUTE ADMIT ADOBE ADOPT ADORE AGAPE AGATE AGREE AHEAD ALBUM ALIEN ALIKE ALLOW ALOFT ALONE ALOUD ALPHA ALTAR ALTER AMBER AMPLE ANGRY ANTIC AORTA APHID APPLE APPLY APRON APTLY ARBOR ARGUE AROMA ASIDE ASKEW ASSET ATOLL ATONE AUDIT AVAIL AVERT AWAKE AWFUL AXIOM BADGE BADLY BAKER BANAL BASIC BATON BATTY BAYOU BEADY BEEFY BEGIN BEING BELCH BELIE BELLY BENCH BERTH BESET BIOME BIRTH BLACK BLAME BLAND BLEED BLOKE BLOWN BLUFF BLURB BLURT BLUSH BOOBY BOOST BOOZE BOOZY BOUGH BRAID BRAKE BRAVE BREAD BREAK BRIAR BRIBE BRINE BRING BRINK BRISK BUGGY CACAO CACHE CANNY CARGO CARRY CATER CATCH CAULK CHAFE CHAMP CHANT CHARD CHARM CHEAT CHEEK CHEST CHIEF CHILL CHOKE CHORD CHUNK CHUTE CIDER CIGAR CINCH CIVIC CLASS CLEAN CLICK CLING CLOCK CLOTH CLOWN CLUCK COAST COLON COMET COMMA CONDO CONIC CORNY COULD COUNT COYLY CRAMP CRANK CRASS CRATE CRAVE CRAZE CRAZY CREAK CREDO CREPT CRIMP CROAK CROSS CRUST CYNIC DANCE DANDY DEATH DEBUG DELTA DELVE DENIM DEPOT DEPTH DIGIT DODGE DONOR DOUBT DOWRY DOZEN DRAIN DREAM DRINK DRIVE DROLL DUCHY DUTCH DUVET DWARF EGRET EJECT ELDER ELOPE ELUDE EMAIL ENEMA ENJOY EPOCH EPOXY EQUAL ERODE ERROR ESSAY EVADE EVERY EXCEL EXIST EXTRA EXULT FARCE FAULT FAVOR FEAST FEIGN FERRY FEWER FIELD FIFTY FINER FIRST FISHY FIXER FJORD FLAIL FLAIR FLESH FLICK FLING FLIRT FLOAT FLOCK FLOOD FLOOR FLORA FLOSS FLOUT FLUFF FLUME FOCAL FOCUS FOGGY FORAY FORGE FORGO FORTH FOUND FOYER FRAME FRESH FROCK FRONT FROTH FUNGI GAMER GAMMA GAUDY GAUZE GAWKY GECKO GIANT GIRTH GLASS GLEAN GLOAT GLOOM GLORY GLOVE GLYPH GOLEM GONER GOOSE GORGE GOUGE GRADE GRATE GREAT GREET GRIME GRIMY GRIPE GROIN GROUP GROUT GROVE GROWL GRUEL GUANO GUILD GULLY HAIRY HAPPY HATCH HAVOC HEADY HEATH HEIST HELIX HERON HINGE HOARD HOMER HORSE HOWDY HUMAN HUMOR HUMPH HUNKY HURRY HUTCH HYPER IMPEL INANE INEPT INERT INFER INPUT INTER IONIC IRONY ISLET ITCHY IVORY JAUNT JOUST JUDGE KARMA KEBAB KHAKI KIOSK KNOCK KNOLL KOALA LABEL LABOR LAPEL LAPSE LARVA LAYER LEAFY LEAPT LEAVE LEERY LEMON LIBEL LIGHT LILAC LINEN LIVER LOFTY LOOPY LOSER LOWLY LUNAR LUSTY LYING MADAM MAGIC MAIZE MAJOR MANLY MANOR MAPLE MARCH MARRY MARSH MASSE MATEY MAXIM MEALY MEDAL MERIT METAL MIDGE MIDST MIMIC MINCE MODEL MOIST MOLAR MONEY MONTH MOOSE MOTOR MOTTO MOULT MOUNT MOURN MOVIE MUCKY MUMMY NAIVE NASTY NATAL NAVAL NEEDY NIGHT NINTH NYMPH OFFAL OLIVE ONSET OPERA OTHER OUGHT OUTDO OXIDE PANEL PANIC PAPER PARER PARRY PATTY PAUSE PEACH PERCH PERKY PHASE PHOTO PICKY PIETY PILOT PINEY PINKY PINTO PITHY PIXIE PLANT PLEAT PLUCK POINT POISE POKER POLKA POUND POWER PRICK PRIDE PRIME PRIMO PRINT PRIZE PROBE PROVE PROXY PULPY PURGE QUART QUERY QUIET QUIRK RADIO RAINY RATIO REACT REBUS REBUT RECAP REGAL RENEW REPAY RETCH RETRO REVEL RHINO RHYME RIPER RIVAL ROBIN ROBOT ROGUE ROOMY ROUGE ROUND ROYAL RUDDY RUDER RUPEE RUSTY SAINT SALAD SALSA SAUTE SCALD SCARE SCOLD SCORN SCOUR SCRAP SEDAN SEEDY SERVE SEVER SHAKE SHALL SHAME SHARD SHAWL SHINE SHIRE SHIRK SHOWN SHOWY SHRUB SHRUG SIEGE SISSY SKILL SKIRT SLATE SLEEK SLOSH SLOTH SLUMP SLUNG SMART SMASH SMEAR SMELT SMITE SNARL SNEAK SNOUT SOGGY SOLAR SOLVE SONIC SOUND SOWER SPADE SPELL SPEND SPICY SPIEL SPIKE SPILL SPIRE SPOKE SPRAY SQUAD SQUAT STAFF STAGE STAID STAIR STALE STAND START STEAD STEED STEIN STICK STING STINK STOCK STOMP STOOL STORE STORY STOUT STOVE STUDY SUGAR SURER SURLY SWEAT SWEEP SWEET SWILL SWIRL SYRUP TACIT TANGY TAPER TAPIR TASTY TAUNT TEASE TEPID THEIR THEME THERE THIRD THORN THOSE THUMB THYME TIARA TIBIA TIGER TILDE TIPSY TODAY TORSO TOTEM TOUGH TOXIC TRACE TRAIN TRAIT TRASH TRAWL TREAT TREND TRIAD TRICE TRITE TROLL TROPE TROVE TRUSS TRYST TWANG TWEED TWICE TWINE ULCER ULTRA UNDUE UNFED UNFIT UNIFY UNITE UNLIT UNMET UNTIE UPSET USAGE USHER USING USUAL USURP VAGUE VALET VALID VIGOR VIRAL VITAL VIVID VODKA VOICE VOTER VOUCH WACKY WALTZ WASTE WATCH WEARY WEDGE WHACK WHELP WHERE WHINE WHOOP WINCE WOKEN WOOER WORLD WORRY WORSE WOVEN WROTE WRUNG YACHT YEARN YIELD YOUTH ZESTY";

    private String actualWord = "";
    public ToDoWithWords()
    {
    }
    // Selects a random word from the string masterWordList
    String randomWord()
    {
        int randomWord = (int)(Math.random() * 657);
        int whichWord = 6 * randomWord;
        String tempWord = masterWordList.substring(whichWord, whichWord + 5);
        actualWord = tempWord;
        return tempWord;
    }

    String getActualWord()
    {
        return actualWord;
    }
    // This method takes in a given word -- gWord -- then compares it to the actual word and returns a 
    // string of 5 characters that tells the player if the guess word contains or does not contain those
    // characters
    String compare(String gGuess)
    {
        String out = "";
        String compareChar;
        String [] redYellowGreen = new String [5];
        for (int x = 0; x < 5; x++)
        {
            compareChar = gGuess.substring(x, x + 1);
            if (compareChar.equalsIgnoreCase(this.actualWord.substring(x, x + 1)))
            {
                redYellowGreen[x] = "G";
            }
            if (!(compareChar.equalsIgnoreCase(this.actualWord.substring(x, x + 1))))
            {
                for (int y = 0; y < 5; y++)
                {
                    if (compareChar.equalsIgnoreCase(this.actualWord.substring(y, y + 1)))
                    {
                        redYellowGreen[x] = "Y";
                    }
                }
            }
            if (redYellowGreen[x] != "G" && redYellowGreen[x] != "Y")
            {
                redYellowGreen[x] = "R";
            }
        }
        for (int x = 0; x < 5; x++)
        {
            out = out + redYellowGreen[x];
        }
        return out;
    }
}
