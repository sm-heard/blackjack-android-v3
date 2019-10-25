package edu.cnm.deepdive.blackjack.controller.fsm;

import android.os.Bundle;
import androidx.preference.PreferenceFragmentCompat;
import edu.cnm.deepdive.blackjack.R;

public class SettingsFragment extends PreferenceFragmentCompat {

  @Override
  public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
    setPreferencesFromResource(R.xml.root_preferences, rootKey);
//      PreferenceScreen screen = getPreferenceScreen();
//      SeekBarPreference decksInShoe = screen.findPreference(getString(R.string.decks_per_shoe_key));
//      SwitchPreferenceCompat soft17 = screen.findPreference(getString(R.string.rule_soft_17));
//      SwitchPreferenceCompat noHoldCard = screen.findPreference(getString(R.string.rule_no_hold_card));

  }
}
