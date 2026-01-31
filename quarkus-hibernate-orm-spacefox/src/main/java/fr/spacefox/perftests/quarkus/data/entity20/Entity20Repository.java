package fr.spacefox.perftests.quarkus.data.entity20;

import fr.spacefox.perftests.quarkus.core.port.data.Entity20DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service20.model.Model20;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity20Repository implements Entity20DatasourcePort, PanacheRepository<Entity20> {
    @Override
    public Optional<Model20> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
