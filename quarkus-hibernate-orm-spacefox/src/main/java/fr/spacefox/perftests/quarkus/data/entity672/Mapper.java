package fr.spacefox.perftests.quarkus.data.entity672;

import fr.spacefox.perftests.quarkus.core.service672.model.Model672;

final class Mapper {
    private Mapper() {}

    public static Model672 of(Entity672 entity) {
        return new Model672(entity.getId(), entity.getField());
    }
}
