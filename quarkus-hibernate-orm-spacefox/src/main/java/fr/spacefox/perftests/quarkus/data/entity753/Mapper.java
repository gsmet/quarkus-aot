package fr.spacefox.perftests.quarkus.data.entity753;

import fr.spacefox.perftests.quarkus.core.service753.model.Model753;

final class Mapper {
    private Mapper() {}

    public static Model753 of(Entity753 entity) {
        return new Model753(entity.getId(), entity.getField());
    }
}
