package fr.spacefox.perftests.quarkus.rest.endpoint736;

import fr.spacefox.perftests.quarkus.core.service736.model.Model736;
import fr.spacefox.perftests.quarkus.rest.endpoint736.schema.Schema736;

final class Mapper {
    private Mapper() {}

    public static Schema736 of(Model736 model) {
        return new Schema736(model.id(), model.value());
    }
}
