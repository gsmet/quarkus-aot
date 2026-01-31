package fr.spacefox.perftests.quarkus.data.entity636;

import fr.spacefox.perftests.quarkus.core.port.data.Entity636DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service636.model.Model636;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity636Repository implements Entity636DatasourcePort, PanacheRepository<Entity636> {
    @Override
    public Optional<Model636> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
