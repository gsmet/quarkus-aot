package fr.spacefox.perftests.quarkus.data.entity908;

import fr.spacefox.perftests.quarkus.core.port.data.Entity908DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service908.model.Model908;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity908Repository implements Entity908DatasourcePort, PanacheRepository<Entity908> {
    @Override
    public Optional<Model908> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
