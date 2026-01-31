package fr.spacefox.perftests.quarkus.rest.endpoint936;

import fr.spacefox.perftests.quarkus.core.service936.model.Model936;
import fr.spacefox.perftests.quarkus.rest.endpoint936.schema.Schema936;

final class Mapper {
    private Mapper() {}

    public static Schema936 of(Model936 model) {
        return new Schema936(model.id(), model.value());
    }
}
