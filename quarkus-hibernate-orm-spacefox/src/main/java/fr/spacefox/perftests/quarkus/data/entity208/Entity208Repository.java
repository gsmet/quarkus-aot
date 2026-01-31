package fr.spacefox.perftests.quarkus.data.entity208;

import fr.spacefox.perftests.quarkus.core.port.data.Entity208DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service208.model.Model208;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity208Repository implements Entity208DatasourcePort, PanacheRepository<Entity208> {
    @Override
    public Optional<Model208> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
