package LeetCode75;

import java.util.*;
//TODO
public class TreeTraversal {
    int val;
    TreeTraversal left;
    TreeTraversal right;

    TreeTraversal() {}
    TreeTraversal(int val) { this.val = val; }
    TreeTraversal(int val, TreeTraversal left, TreeTraversal right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static List<List<Integer>> verticalTraversal (TreeTraversal root) {

        return null;
    }

    public void CreateTree(TreeTraversal root, List<Integer> values) {

    }

    public static void main(String[] args) {
        String tryMe = "biology\n" +
                "history\n" +
                "geography-and-places\n" +
                "natural-sciences\n" +
                "warfare\n" +
                "music\n" +
                "social-sciences-and-society\n" +
                "language-and-literature\n" +
                "media-and-drama\n" +
                "engineering-and-technology\n" +
                "sports-and-recreation\n" +
                "transport\n" +
                "video-games\n" +
                "media\n" +
                "art-and-architecture\n" +
                "meteorology\n" +
                "art-architecture-and-archaeology\n" +
                "religion-mysticism-and-mythology\n" +
                "agriculture-food-and-drink\n" +
                "literature-and-theatre\n" +
                "politics-and-government\n" +
                "video-gaming\n" +
                "business-economics-and-finance\n" +
                "sport-and-recreation\n" +
                "royalty-and-nobility\n" +
                "computing\n" +
                "education\n" +
                "philosophy-and-religion\n" +
                "culture-and-society\n" +
                "food-and-drink\n" +
                "physics-and-astronomy\n" +
                "mathematics\n" +
                "health-and-medicine\n" +
                "law\n" +
                "geology-and-geophysics\n" +
                "chemistry-and-mineralogy\n" +
                "philosophy-and-psychology\n" +
                "language-and-linguistics\n" +
                "heraldry-honors-and-vexillology\n" +
                "health-and-wellness\n" +
                "fitness-and-exercise\n" +
                "weight-loss\n" +
                "nutrition-and-dieting\n" +
                "mental-health\n" +
                "yoga-and-meditation\n" +
                "alternative-medicine\n" +
                "beauty-and-skincare\n" +
                "personal-finance\n" +
                "investing-and-stocks\n" +
                "real-estate\n" +
                "home-improvement\n" +
                "gardening\n" +
                "diy-crafts\n" +
                "parenting\n" +
                "pregnancy-and-maternity\n" +
                "travel-and-adventure\n" +
                "food-and-cooking\n" +
                "recipes-and-culinary-tips\n" +
                "technology-and-gadgets\n" +
                "gaming-and-esports\n" +
                "mobile-apps\n" +
                "software-development\n" +
                "web-design-and-development\n" +
                "online-marketing\n" +
                "social-media-marketing\n" +
                "email-marketing\n" +
                "affiliate-marketing\n" +
                "e-commerce-and-dropshipping\n" +
                "fashion-and-style\n" +
                "mens-fashion\n" +
                "womens-fashion\n" +
                "sustainable-living\n" +
                "eco-friendly-products\n" +
                "pet-care\n" +
                "dog-training\n" +
                "cat-care\n" +
                "personal-development\n" +
                "leadership-and-management\n" +
                "career-advice\n" +
                "education-and-e-learning\n" +
                "language-learning\n" +
                "online-courses\n" +
                "personal-branding\n" +
                "motivation-and-inspiration\n" +
                "self-help-and-self-improvement\n" +
                "relationships-and-dating\n" +
                "marriage-and-family-counseling\n" +
                "online-dating\n" +
                "home-decor\n" +
                "interior-design\n" +
                "furniture-and-furnishings\n" +
                "photography\n" +
                "wedding-planning\n" +
                "event-planning\n" +
                "home-security\n" +
                "cybersecurity\n" +
                "home-automation\n" +
                "renewable-energy\n" +
                "electric-vehicles\n" +
                "sustainable-fashion\n" +
                "travel-hacks\n" +
                "camping-and-hiking\n" +
                "fishing-and-outdoor-activities";
        String newOne = tryMe.replace("\n", ",");
        System.out.println(newOne);
    }
}
