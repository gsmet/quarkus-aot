package fr.spacefox.perftests.quarkus.rest.endpoint164;

import fr.spacefox.perftests.quarkus.core.service164.model.Model164;
import fr.spacefox.perftests.quarkus.rest.endpoint164.schema.Schema164;

final class Mapper {
    private Mapper() {}

    public static Schema164 of(Model164 model) {
        return new Schema164(model.id(), model.value());
    }
}
