/**
 * @author Sabin Bhandari 30000374
 * @author Shikhat Karkee 30000394
 * @author Temirlan Ulugbek uulu 30000294
 * @author Zihan Qi 30000612
 * Assignment 4, Problem 2
 * Created on: 7th April, 2018
 * Last Modified on: 13th April, 2018
 * This class provides the main function that connects to the web site, retrieve the web page, 
 * and extract the requested information about a certain country.
 *
 */

import java.util.*;
import java.io.*;
import org.jsoup.Jsoup;
public class driver {
	
	//creating a data map for countries and its text from the website
	//information retrieval method
	@SuppressWarnings("serial")
	public static HashMap<String, String> dataMap = new HashMap<String, String>() {{
	        put("Afghanistan", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_af.html");
	        put("Akrotiri", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ax.html");
	        put("Albania", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_al.html");
	        put("Algeria", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ag.html");
	        put("American Samoa", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_aq.html");
	        put("Andorra", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_an.html");
	        put("Angola", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ao.html");
	        put("Anguilla", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_av.html");
	        put("Antarctica", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ay.html");
	        put("Antigua and Barbuda", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ac.html");
	        put("Arctic Ocean", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_xq.html");
	        put("Argentina", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ar.html");
	        put("Armenia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_am.html");
	        put("Aruba", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_aa.html");
	        put("Ashmore and Cartier Islands", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_at.html");
	        put("Atlantic Ocean", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_zh.html");
	        put("Australia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_as.html");
	        put("Austria", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_au.html");
	        put("Azerbaijan", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_aj.html");
	        put("Bahamas, The", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_bf.html");
	        put("Bahrain", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ba.html");
	        put("Baker Island", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_fq.html");
	        put("Bangladesh", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_bg.html");
	        put("Barbados", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_bb.html");
	        put("Belarus", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_bo.html");
	        put("Belgium", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_be.html");
	        put("Belize", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_bh.html");
	        put("Benin", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_bn.html");
	        put("Bermuda", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_bd.html");
	        put("Bhutan", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_bt.html");
	        put("Bolivia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_bl.html");
	        put("Bosnia and Herzegovina", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_bk.html");
	        put("Botswana", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_bc.html");
	        put("Bouvet Island", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_bv.html");
	        put("Brazil", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_br.html");
	        put("British Indian Ocean Territory", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_io.html");
	        put("British Virgin Islands", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_vi.html");
	        put("Brunei", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_bx.html");
	        put("Bulgaria", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_bu.html");
	        put("Burkina Faso", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_uv.html");
	        put("Burma", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_bm.html");
	        put("Burundi", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_by.html");
	        put("Cabo Verde", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_cv.html");
	        put("Cambodia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_cb.html");
	        put("Cameroon", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_cm.html");
	        put("Canada", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ca.html");
	        put("Cayman Islands", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_cj.html");
	        put("Central African Republic", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ct.html");
	        put("Chad", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_cd.html");
	        put("Chile", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ci.html");
	        put("China", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ch.html");
	        put("Christmas Island", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_kt.html");
	        put("Clipperton Island", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ip.html");
	        put("Cocos (Keeling) Islands", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ck.html");
	        put("Colombia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_co.html");
	        put("Comoros", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_cn.html");
	        put("Congo, Democratic Republic of The", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_cg.html");
	        put("Congo, Republic of the", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_cf.html");
	        put("Cook Islands", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_cw.html");
	        put("Coral Sea Islands", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_cr.html");
	        put("Costa Rica", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_cs.html");
	        put("Cote d'Ivoire", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_iv.html");
	        put("Croatia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_hr.html");
	        put("Cuba", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_cu.html");
	        put("Curacao", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_cc.html");
	        put("Cyprus", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_cy.html");
	        put("Czech Republic", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ez.html");
	        put("Denmark", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_da.html");
	        put("Dhekelia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_dx.html");
	        put("Djibouti", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_dj.html");
	        put("Dominica", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_do.html");
	        put("Dominican Republic", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_dr.html");
	        put("Ecuador", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ec.html");
	        put("Egypt", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_eg.html");
	        put("El Salvador", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_es.html");
	        put("Equatorial Guinea", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ek.html");
	        put("Eritrea", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_er.html");
	        put("Estonia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_en.html");
	        put("Ethiopia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_et.html");
	        put("Falkland Islands (Islas Malvinas)", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_fk.html");
	        put("Faroe Islands", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_fo.html");
	        put("Fiji", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_fj.html");
	        put("Finland", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_fi.html");
	        put("France", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_fr.html");
	        put("French Polynesia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_fp.html");
	        put("French Southern and Antarctic Lands", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_fs.html");
	        put("Gabon", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_gb.html");
	        put("Gambia, The", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ga.html");
	        put("Gaza Strip", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_gz.html");
	        put("Georgia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_gg.html");
	        put("Germany", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_gm.html");
	        put("Ghana", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_gh.html");
	        put("Gibraltar", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_gi.html");
	        put("Greece", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_gr.html");
	        put("Greenland", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_gl.html");
	        put("Grenada", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_gj.html");
	        put("Guam", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_gq.html");
	        put("Guatemala", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_gt.html");
	        put("Guernsey", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_gk.html");
	        put("Guinea", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_gv.html");
	        put("Guinea-Bissau", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_pu.html");
	        put("Guyana", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_gy.html");
	        put("Haiti", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ha.html");
	        put("Heard Island and McDonald Islands", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_hm.html");
	        put("Holy See (Vatican City)", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_vt.html");
	        put("Honduras", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ho.html");
	        put("Hong Kong", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_hk.html");
	        put("Howland Island", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_hq.html");
	        put("Hungary", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_hu.html");
	        put("Iceland", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ic.html");
	        put("India", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_in.html");
	        put("Indian Ocean", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_xo.html");
	        put("Indonesia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_id.html");
	        put("Iran", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ir.html");
	        put("Iraq", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_iz.html");
	        put("Ireland", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ei.html");
	        put("Isle of Man", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_im.html");
	        put("Israel", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_is.html");
	        put("Italy", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_it.html");
	        put("Jamaica", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_jm.html");
	        put("Jan Mayen", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_jn.html");
	        put("Japan", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ja.html");
	        put("Jarvis Island", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_dq.html");
	        put("Jersey", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_je.html");
	        put("Johnston Atoll", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_jq.html");
	        put("Jordan", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_jo.html");
	        put("Kazakhstan", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_kz.html");
	        put("Kenya", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ke.html");
	        put("Kingman Reef", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_kq.html");
	        put("Kiribati", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_kr.html");
	        put("Korea, North", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_kn.html");
	        put("Korea, South", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ks.html");
	        put("Kosovo", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_kv.html");
	        put("Kuwait", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ku.html");
	        put("Kyrgyzstan", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_kq.html");
	        put("Laos", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_la.html");
	        put("Latvia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_lq.html");
	        put("Lebanon", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_le.html");
	        put("Lesotho", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_lt.html");
	        put("Liberia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_li.html");
	        put("Libya", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ly.html");
	        put("Liechtenstein", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ls.html");
	        put("Lithuania", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_lh.html");
	        put("Luxembourg", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_lu.html");
	        put("Macau", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_mc.html");
	        put("Macedonia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_mk.html");
	        put("Madagascar", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ma.html");
	        put("Malawi", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_mi.html");
	        put("Malaysia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_my.html");
	        put("Maldives", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_mv.html");
	        put("Mali", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ml.html");
	        put("Malta", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_mt.html");
	        put("Marshall Islands", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_rm.html");
	        put("Mauritania", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_mr.html");
	        put("Mauritius", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_mp.html");
	        put("Mexico", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_mx.html");
	        put("Micronesia, Federated States of", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_fm.html");
	        put("Midway Islands", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_mq.html");
	        put("Moldova", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_md.html");
	        put("Monaco", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_mn.html");
	        put("Mongolia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_mg.html");
	        put("Montenegro", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_mj.html");
	        put("Montserrat", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_mh.html");
	        put("Morocco", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_mo.html");
	        put("Mozambique", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_mz.html");
	        put("Namibia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_wa.html");
	        put("Nauru", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_nr.html");
	        put("Navassa Island", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_bq.html");
	        put("Nepal", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_np.html");
	        put("Netherlands", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_nl.html");
	        put("New Caledonia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_nc.html");
	        put("New Zealand", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_nz.html");
	        put("Nicaragua", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_nu.html");
	        put("Niger", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ng.html");
	        put("Nigeria", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ni.html");
	        put("Niue", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ne.html");
	        put("Norfolk Island", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_nf.html");
	        put("Northern Mariana Islands", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_cq.html");
	        put("Norway", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_no.html");
	        put("Oman", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_mu.html");
	        put("Pacific Ocean", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_zn.html");
	        put("Pakistan", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_pk.html");
	        put("Palau", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ps.html");
	        put("Palmyra Atoll", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_lq.html");
	        put("Panama", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_pm.html");
	        put("Papua New Guinea", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_pp.html");
	        put("Paracel Islands", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_pf.html");
	        put("Paraguay", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_pa.html");
	        put("Peru", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_pe.html");
	        put("Philippines", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_rp.html");
	        put("Pitcairn Islands", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_pc.html");
	        put("Poland", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_pl.html");
	        put("Portugal", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_po.html");
	        put("Puerto Rico", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_rq.html");
	        put("Qatar", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_qa.html");
	        put("Romania", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ro.html");
	        put("Russia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_rs.html");
	        put("Rwanda", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_rw.html");
	        put("Saint Barthelemy", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_tb.html");
	        put("Saint Helena, Ascension, and Tristan da Cunha", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_sh.html");
	        put("Saint Kitts and Nevis", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_sc.html");
	        put("Saint Lucia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_st.html");
	        put("Saint Martin", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_rn.html");
	        put("Saint Pierre and Miquelon", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_sb.html");
	        put("Saint Vincent and the Grenadines", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_vc.html");
	        put("Samoa", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ws.html");
	        put("San Marino", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_sm.html");
	        put("Sao Tome and Principe", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_tp.html");
	        put("Saudi Arabia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_sa.html");
	        put("Senegal", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_sg.html");
	        put("Serbia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ri.html");
	        put("Seychelles", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_se.html");
	        put("Sierra Leone", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_sl.html");
	        put("Singapore", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_sn.html");
	        put("Sint Maarten", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_sk.html");
	        put("Slovakia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_lo.html");
	        put("Slovenia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_si.html");
	        put("Solomon Islands", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_bp.html");
	        put("Somalia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_so.html");
	        put("South Africa", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_sf.html");
	        put("Southern Ocean", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_oo.html");
	        put("South Georgia and South Sandwich Islands", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_sx.html");
	        put("South Sudan", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_od.html");
	        put("Spain", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_sp.html");
	        put("Spratly Islands", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_pg.html");
	        put("Sri Lanka", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ce.html");
	        put("Sudan", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_su.html");
	        put("Suriname", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ns.html");
	        put("Svalbard", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_sv.html");
	        put("Swaziland", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_wz.html");
	        put("Sweden", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_sw.html");
	        put("Switzerland", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_sz.html");
	        put("Syria", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_sy.html");
	        put("Taiwan", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_tw.html");
	        put("Tajikistan", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ti.html");
	        put("Tanzania", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_tz.html");
	        put("Thailand", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_th.html");
	        put("Timor-Leste", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_tt.html");
	        put("Togo", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_to.html");
	        put("Tokelau", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_tl.html");
	        put("Tonga", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_tn.html");
	        put("Trinidad and Tobago", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_td.html");
	        put("Tunisia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ts.html");
	        put("Turkey", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_tu.html");
	        put("Turkmenistan", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_tx.html");
	        put("Turks and Caicos Islands", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_tk.html");
	        put("Tuvalu", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_tv.html");
	        put("Uganda", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ug.html");
	        put("Ukraine", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_up.html");
	        put("United Arab Emirates", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ae.html");
	        put("United Kingdom", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_uk.html");
	        put("United States", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_us.html");
	        put("United States Pacific Island Wildlife Refuges", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_um.html");
	        put("Uruguay", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_uy.html");
	        put("Uzbekistan", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_uz.html");
	        put("Vanuatu", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_nh.html");
	        put("Venezuela", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ve.html");
	        put("Vietnam", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_vm.html");
	        put("Virgin Islands", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_vq.html");
	        put("Wake Island", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_wq.html");
	        put("Wallis and Futuna", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_wf.html");
	        put("West Bank", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_we.html");
	        put("Western Sahara", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_wi.html");
	        put("Yemen", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_ym.html");
	        put("Zambia", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_za.html");
	        put("Zimbabwe", "https://www.cia.gov/library/publications/the-world-factbook/geos/print_zi.html");
	    }};
	    
	    
	    //This function extracts area, capital and unemployment rate from text of correct address of the country.
	    public static String getData(String country) {
	        try {
	            String address = Jsoup.connect(dataMap.get(country)).get().text();
	            String area = address.split("Area: total: ")[1].split(" ")[0];
	            String capital = address.split("Capital: name: ")[1].split(" ")[0];
	            String unemploymentRate = address.split("Unemployment rate: ")[1].split(" ")[0];

	            return "The area is " + area + "; The capital is: " + capital + "; The unemployment rate is " + unemploymentRate;
	        }
	        catch (IOException e) {
	            System.out.println("Invalid Country!");
	            System.exit(1);
	        }
	        catch (IllegalArgumentException e) {
	            System.out.println("Illegal Country");
	            System.exit(1);
	        }
	        return "";
	    }
	    /**
	     * @param args Main Implementation
	     */
	    public static void main(String[] args) throws IOException {
	    	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	    	String country;
	    	while (true) {
	    		System.out.println("Information about a country will be given. Type a country name with first letter in Uppercase.");
	    		System.out.println ("Choose a country, bitte: ");
	    		country = buffer.readLine();
	    		System.out.println(getData(country));
	    		System.out.println("Do you want to do it again? Choose Y/N: ");
	    		String decision = buffer.readLine();
	    		if (decision.equals("n") || decision.equals("N")) {
	    			System.out.println("Thank You. BYE!");
	    			break;
	    		}
	    	}
	    }

}
