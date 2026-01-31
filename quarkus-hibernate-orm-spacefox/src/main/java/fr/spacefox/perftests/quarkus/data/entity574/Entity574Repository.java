package fr.spacefox.perftests.quarkus.data.entity574;

import fr.spacefox.perftests.quarkus.core.port.data.Entity574DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service574.model.Model574;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity574Repository implements Entity574DatasourcePort, PanacheRepository<Entity574> {
    @Override
    public Optional<Model574> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
