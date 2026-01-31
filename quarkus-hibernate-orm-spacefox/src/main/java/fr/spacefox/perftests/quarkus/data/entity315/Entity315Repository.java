package fr.spacefox.perftests.quarkus.data.entity315;

import fr.spacefox.perftests.quarkus.core.port.data.Entity315DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service315.model.Model315;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity315Repository implements Entity315DatasourcePort, PanacheRepository<Entity315> {
    @Override
    public Optional<Model315> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
