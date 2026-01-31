package fr.spacefox.perftests.quarkus.core.service184;

import fr.spacefox.perftests.quarkus.core.port.data.Entity184DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service184.model.Model184;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service184 {

    private final Entity184DatasourcePort datasource;

    public Service184(Entity184DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model184 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
