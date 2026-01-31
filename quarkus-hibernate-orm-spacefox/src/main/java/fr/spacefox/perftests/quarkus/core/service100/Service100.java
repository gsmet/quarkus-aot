package fr.spacefox.perftests.quarkus.core.service100;

import fr.spacefox.perftests.quarkus.core.port.data.Entity100DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service100.model.Model100;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service100 {

    private final Entity100DatasourcePort datasource;

    public Service100(Entity100DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model100 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
