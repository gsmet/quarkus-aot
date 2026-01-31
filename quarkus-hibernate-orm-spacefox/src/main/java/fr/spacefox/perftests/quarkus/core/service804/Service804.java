package fr.spacefox.perftests.quarkus.core.service804;

import fr.spacefox.perftests.quarkus.core.port.data.Entity804DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service804.model.Model804;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service804 {

    private final Entity804DatasourcePort datasource;

    public Service804(Entity804DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model804 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
