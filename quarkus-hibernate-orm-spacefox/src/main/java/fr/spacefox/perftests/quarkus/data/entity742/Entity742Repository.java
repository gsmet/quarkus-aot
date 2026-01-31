package fr.spacefox.perftests.quarkus.data.entity742;

import fr.spacefox.perftests.quarkus.core.port.data.Entity742DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service742.model.Model742;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity742Repository implements Entity742DatasourcePort, PanacheRepository<Entity742> {
    @Override
    public Optional<Model742> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
