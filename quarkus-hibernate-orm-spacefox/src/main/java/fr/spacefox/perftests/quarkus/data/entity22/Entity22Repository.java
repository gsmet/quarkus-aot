package fr.spacefox.perftests.quarkus.data.entity22;

import fr.spacefox.perftests.quarkus.core.port.data.Entity22DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service22.model.Model22;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity22Repository implements Entity22DatasourcePort, PanacheRepository<Entity22> {
    @Override
    public Optional<Model22> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
