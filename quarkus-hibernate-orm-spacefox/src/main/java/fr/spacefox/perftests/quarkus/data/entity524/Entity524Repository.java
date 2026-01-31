package fr.spacefox.perftests.quarkus.data.entity524;

import fr.spacefox.perftests.quarkus.core.port.data.Entity524DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service524.model.Model524;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity524Repository implements Entity524DatasourcePort, PanacheRepository<Entity524> {
    @Override
    public Optional<Model524> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
