package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AllegroTestingAppCSS {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");
        iAgree(driver);
        searchFor(driver);
        driver.close();
    }

    public static void iAgree(ChromeDriver driver) {
        WebElement iAgreeButton = driver.findElementByCssSelector("body > div.main-wrapper > div:nth-child(7) > div > div._15pc6._d9spf.mpof_z0.m7er_k4.mp7g_oz.mse2_56.mp4t_0.m3h2_0.mryx_0.munh_0.m911_5r.mefy_5r.mnyp_5r.mdwl_5r.mh36_0.mg9e_16.msts_9u.mjb5_zl.meqh_bv.mj7a_8.mj7a_16_m > div._854c2_OPWNL._9f0v0._jkrtd.mj7a_0.mh36_16.mvrt_16.mg9e_16.mpof_ki.m389_6m.munh_56.m3h2_56.myre_zn.myre_8v_s.m7f5_5x_s._854c2_21ZR4 > button.m7er_0k.m7er_56_s.m3h2_16_m._854c2_2sUz3.m3h2_16_s._854c2_167Bx.mgn2_14.mp0t_0a.m9qz_yo.mp7g_oh.mse2_40.mqu1_40.mtsp_ib.mli8_k4.mp4t_0.m3h2_0.mryx_0.munh_0.m911_5r.mefy_5r.mnyp_5r.mdwl_5r.msbw_2.mldj_2.mtag_2.mm2b_2.mqvr_2.msa3_z4.mqen_m6.meqh_en.m0qj_5r.mh36_16.mvrt_16.mg9e_0.mj7a_0.m9tr_pf.m2ha_2.m8qd_qh.mjt1_n2.bqyr8.mgmw_9u.msts_enp.mrmn_qo.mrhf_u8.m31c_kb.m0ux_fp.b1bc7");
        iAgreeButton.click();
    }

    public static void searchFor(ChromeDriver driver) throws InterruptedException {
        WebElement searchForTextBox = driver.findElement(By.cssSelector("body > div.main-wrapper > div:nth-child(3) > header > div > div > div:nth-child(1) > div > form > input"));
        searchForTextBox.click();
        searchForTextBox.sendKeys("Mavic mini");
        TimeUnit.SECONDS.sleep(3);
        WebElement categoryBox = driver.findElement(By.cssSelector("body > div.main-wrapper > div:nth-child(3) > header > div > div > div:nth-child(1) > div > form > div.mpof_5r.mpof_ki_s.mp7g_oh.m389_6m.mjyo_6x.mse2_40.mp4t_0.mr3m_0.mli2_0.m911_co.mnyp_co.mdwl_co.mx7m_1.mefy_5r.mlkp_ag.msts_9u._d25db_1Qn1q > div > select"));
        Select categoryBoxSelect = new Select(categoryBox);
        categoryBoxSelect.selectByIndex(3);
        TimeUnit.SECONDS.sleep(3);
        WebElement szukajButton = driver.findElement(By.cssSelector("body > div.main-wrapper > div:nth-child(3) > header > div > div > div:nth-child(1) > div > form > button"));
        szukajButton.click();
    }
}
