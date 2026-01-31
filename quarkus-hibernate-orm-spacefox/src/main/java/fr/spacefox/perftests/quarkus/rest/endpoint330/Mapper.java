package fr.spacefox.perftests.quarkus.rest.endpoint330;

import fr.spacefox.perftests.quarkus.core.service330.model.Model330;
import fr.spacefox.perftests.quarkus.rest.endpoint330.schema.Schema330;

final class Mapper {
    private Mapper() {}

    public static Schema330 of(Model330 model) {
        return new Schema330(model.id(), model.value());
    }
}
