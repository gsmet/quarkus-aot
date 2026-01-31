package fr.spacefox.perftests.quarkus.data.entity688;

import fr.spacefox.perftests.quarkus.core.port.data.Entity688DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service688.model.Model688;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity688Repository implements Entity688DatasourcePort, PanacheRepository<Entity688> {
    @Override
    public Optional<Model688> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
