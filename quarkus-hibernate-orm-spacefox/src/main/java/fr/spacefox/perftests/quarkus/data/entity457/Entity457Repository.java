package fr.spacefox.perftests.quarkus.data.entity457;

import fr.spacefox.perftests.quarkus.core.port.data.Entity457DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service457.model.Model457;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity457Repository implements Entity457DatasourcePort, PanacheRepository<Entity457> {
    @Override
    public Optional<Model457> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
