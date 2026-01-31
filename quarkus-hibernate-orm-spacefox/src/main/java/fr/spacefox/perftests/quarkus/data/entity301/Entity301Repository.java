package fr.spacefox.perftests.quarkus.data.entity301;

import fr.spacefox.perftests.quarkus.core.port.data.Entity301DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service301.model.Model301;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity301Repository implements Entity301DatasourcePort, PanacheRepository<Entity301> {
    @Override
    public Optional<Model301> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
