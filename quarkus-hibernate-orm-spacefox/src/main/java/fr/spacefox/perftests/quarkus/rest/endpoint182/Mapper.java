package fr.spacefox.perftests.quarkus.rest.endpoint182;

import fr.spacefox.perftests.quarkus.core.service182.model.Model182;
import fr.spacefox.perftests.quarkus.rest.endpoint182.schema.Schema182;

final class Mapper {
    private Mapper() {}

    public static Schema182 of(Model182 model) {
        return new Schema182(model.id(), model.value());
    }
}
