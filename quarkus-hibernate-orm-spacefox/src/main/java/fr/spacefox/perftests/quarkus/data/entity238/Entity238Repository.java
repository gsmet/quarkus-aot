package fr.spacefox.perftests.quarkus.data.entity238;

import fr.spacefox.perftests.quarkus.core.port.data.Entity238DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service238.model.Model238;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity238Repository implements Entity238DatasourcePort, PanacheRepository<Entity238> {
    @Override
    public Optional<Model238> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
