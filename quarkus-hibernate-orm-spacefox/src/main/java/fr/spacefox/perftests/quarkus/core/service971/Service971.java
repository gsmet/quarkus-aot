package fr.spacefox.perftests.quarkus.core.service971;

import fr.spacefox.perftests.quarkus.core.port.data.Entity971DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service971.model.Model971;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service971 {

    private final Entity971DatasourcePort datasource;

    public Service971(Entity971DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model971 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
