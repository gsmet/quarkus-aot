package fr.spacefox.perftests.quarkus.data.entity680;

import fr.spacefox.perftests.quarkus.core.port.data.Entity680DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service680.model.Model680;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity680Repository implements Entity680DatasourcePort, PanacheRepository<Entity680> {
    @Override
    public Optional<Model680> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
