package fr.spacefox.perftests.quarkus.rest.endpoint791;

import fr.spacefox.perftests.quarkus.core.service791.model.Model791;
import fr.spacefox.perftests.quarkus.rest.endpoint791.schema.Schema791;

final class Mapper {
    private Mapper() {}

    public static Schema791 of(Model791 model) {
        return new Schema791(model.id(), model.value());
    }
}
