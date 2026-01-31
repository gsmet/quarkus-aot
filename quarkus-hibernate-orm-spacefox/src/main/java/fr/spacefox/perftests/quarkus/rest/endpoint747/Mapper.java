package fr.spacefox.perftests.quarkus.rest.endpoint747;

import fr.spacefox.perftests.quarkus.core.service747.model.Model747;
import fr.spacefox.perftests.quarkus.rest.endpoint747.schema.Schema747;

final class Mapper {
    private Mapper() {}

    public static Schema747 of(Model747 model) {
        return new Schema747(model.id(), model.value());
    }
}
