package fr.spacefox.perftests.quarkus.data.entity412;

import fr.spacefox.perftests.quarkus.core.port.data.Entity412DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service412.model.Model412;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity412Repository implements Entity412DatasourcePort, PanacheRepository<Entity412> {
    @Override
    public Optional<Model412> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
