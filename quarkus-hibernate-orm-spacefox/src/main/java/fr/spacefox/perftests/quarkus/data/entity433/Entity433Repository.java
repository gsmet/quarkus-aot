package fr.spacefox.perftests.quarkus.data.entity433;

import fr.spacefox.perftests.quarkus.core.port.data.Entity433DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service433.model.Model433;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity433Repository implements Entity433DatasourcePort, PanacheRepository<Entity433> {
    @Override
    public Optional<Model433> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
