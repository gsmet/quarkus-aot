package fr.spacefox.perftests.quarkus.rest.endpoint350;

import fr.spacefox.perftests.quarkus.core.service350.model.Model350;
import fr.spacefox.perftests.quarkus.rest.endpoint350.schema.Schema350;

final class Mapper {
    private Mapper() {}

    public static Schema350 of(Model350 model) {
        return new Schema350(model.id(), model.value());
    }
}
