package fr.spacefox.perftests.quarkus.data.entity917;

import fr.spacefox.perftests.quarkus.core.port.data.Entity917DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service917.model.Model917;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity917Repository implements Entity917DatasourcePort, PanacheRepository<Entity917> {
    @Override
    public Optional<Model917> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
