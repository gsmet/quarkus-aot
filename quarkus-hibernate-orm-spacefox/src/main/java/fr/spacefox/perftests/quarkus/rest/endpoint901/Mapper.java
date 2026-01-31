package fr.spacefox.perftests.quarkus.rest.endpoint901;

import fr.spacefox.perftests.quarkus.core.service901.model.Model901;
import fr.spacefox.perftests.quarkus.rest.endpoint901.schema.Schema901;

final class Mapper {
    private Mapper() {}

    public static Schema901 of(Model901 model) {
        return new Schema901(model.id(), model.value());
    }
}
