package fr.spacefox.perftests.quarkus.data.entity500;

import fr.spacefox.perftests.quarkus.core.port.data.Entity500DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service500.model.Model500;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity500Repository implements Entity500DatasourcePort, PanacheRepository<Entity500> {
    @Override
    public Optional<Model500> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
