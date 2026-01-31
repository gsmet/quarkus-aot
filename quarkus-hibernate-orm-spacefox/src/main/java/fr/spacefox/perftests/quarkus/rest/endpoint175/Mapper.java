package fr.spacefox.perftests.quarkus.rest.endpoint175;

import fr.spacefox.perftests.quarkus.core.service175.model.Model175;
import fr.spacefox.perftests.quarkus.rest.endpoint175.schema.Schema175;

final class Mapper {
    private Mapper() {}

    public static Schema175 of(Model175 model) {
        return new Schema175(model.id(), model.value());
    }
}
