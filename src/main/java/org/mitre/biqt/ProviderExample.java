// #######################################################################
// NOTICE
//
// This software (or technical data) was produced for the U.S. Government
// under contract, and is subject to the Rights in Data-General Clause
// 52.227-14, Alt. IV (DEC 2007).
//
// Copyright 2019 The MITRE Corporation. All Rights Reserved.
// #######################################################################

package org.mitre.biqt;

import org.mitre.biqt.Provider;
import java.util.Random;
import org.json.simple.JSONObject;

class ProviderExample extends Provider {
	public ProviderExample() {
		super();
	}

	protected void setResults(String filename, JSONObject features,
	                          JSONObject metrics) {
		Random random = new Random();
		metrics.put("quality", random.nextInt(11));
		features.put("left_eye_x", random.nextInt(640));
	}
}
