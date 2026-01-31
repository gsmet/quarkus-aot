package fr.spacefox.perftests.quarkus.data.entity133;

import fr.spacefox.perftests.quarkus.core.port.data.Entity133DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service133.model.Model133;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity133Repository implements Entity133DatasourcePort, PanacheRepository<Entity133> {
    @Override
    public Optional<Model133> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
