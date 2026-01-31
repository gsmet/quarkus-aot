package fr.spacefox.perftests.quarkus.data.entity562;

import fr.spacefox.perftests.quarkus.core.port.data.Entity562DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service562.model.Model562;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity562Repository implements Entity562DatasourcePort, PanacheRepository<Entity562> {
    @Override
    public Optional<Model562> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
