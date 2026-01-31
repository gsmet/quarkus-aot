package fr.spacefox.perftests.quarkus.data.entity926;

import fr.spacefox.perftests.quarkus.core.port.data.Entity926DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service926.model.Model926;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity926Repository implements Entity926DatasourcePort, PanacheRepository<Entity926> {
    @Override
    public Optional<Model926> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
