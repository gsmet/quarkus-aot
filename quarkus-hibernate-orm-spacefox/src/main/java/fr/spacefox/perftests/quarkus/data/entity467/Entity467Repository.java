package fr.spacefox.perftests.quarkus.data.entity467;

import fr.spacefox.perftests.quarkus.core.port.data.Entity467DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service467.model.Model467;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity467Repository implements Entity467DatasourcePort, PanacheRepository<Entity467> {
    @Override
    public Optional<Model467> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
