package fr.spacefox.perftests.quarkus.data.entity468;

import fr.spacefox.perftests.quarkus.core.service468.model.Model468;

final class Mapper {
    private Mapper() {}

    public static Model468 of(Entity468 entity) {
        return new Model468(entity.getId(), entity.getField());
    }
}
