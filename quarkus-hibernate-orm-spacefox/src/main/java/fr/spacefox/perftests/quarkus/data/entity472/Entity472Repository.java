package fr.spacefox.perftests.quarkus.data.entity472;

import fr.spacefox.perftests.quarkus.core.port.data.Entity472DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service472.model.Model472;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity472Repository implements Entity472DatasourcePort, PanacheRepository<Entity472> {
    @Override
    public Optional<Model472> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
