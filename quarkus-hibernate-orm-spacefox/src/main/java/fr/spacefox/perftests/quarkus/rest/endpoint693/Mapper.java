package fr.spacefox.perftests.quarkus.rest.endpoint693;

import fr.spacefox.perftests.quarkus.core.service693.model.Model693;
import fr.spacefox.perftests.quarkus.rest.endpoint693.schema.Schema693;

final class Mapper {
    private Mapper() {}

    public static Schema693 of(Model693 model) {
        return new Schema693(model.id(), model.value());
    }
}
