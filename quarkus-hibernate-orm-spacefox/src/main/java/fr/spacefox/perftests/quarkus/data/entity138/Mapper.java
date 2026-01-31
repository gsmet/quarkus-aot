package fr.spacefox.perftests.quarkus.data.entity138;

import fr.spacefox.perftests.quarkus.core.service138.model.Model138;

final class Mapper {
    private Mapper() {}

    public static Model138 of(Entity138 entity) {
        return new Model138(entity.getId(), entity.getField());
    }
}
