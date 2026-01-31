package fr.spacefox.perftests.quarkus.core.service796;

import fr.spacefox.perftests.quarkus.core.port.data.Entity796DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service796.model.Model796;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service796 {

    private final Entity796DatasourcePort datasource;

    public Service796(Entity796DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model796 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
