package fr.spacefox.perftests.quarkus.data.entity591;

import fr.spacefox.perftests.quarkus.core.service591.model.Model591;

final class Mapper {
    private Mapper() {}

    public static Model591 of(Entity591 entity) {
        return new Model591(entity.getId(), entity.getField());
    }
}
